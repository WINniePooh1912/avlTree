class Tree {
	int value;
	Tree right;
	Tree left;
	private Tree root;

	// other properties
	int height;

	Tree() {}

	Tree(int value) {
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public Tree getLeft() {
		return left;
	}

	public Tree getRight() {
		return right;
	}

	public Tree getRoot() {
		return root;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	private Tree addRecursive(Tree branch, int value) {
		if (branch == null)
			return new Tree(value);

		if (value < branch.value)
			branch.left= addRecursive(branch.left, value);
		else if (value > branch.value)
			branch.right= addRecursive(branch.right, value);
		else
			return branch;

		updateHeight(branch);
		return branch;
	}

	public void addBalance(int value) {
		root = addBalanceRecursive(root, value);
	}

	private Tree addBalanceRecursive(Tree branch, int value) {
		if (branch == null)
			return new Tree(value);

		if (value < branch.value)
			branch.left= addBalanceRecursive(branch.left, value);
		else if (value > branch.value)
			branch.right= addBalanceRecursive(branch.right, value);
		else
			return branch;

		updateHeight(branch);
		int balance = getBalance(branch);

		if (balance > 1 && value < branch.left.value)
			return rightRotation(branch);

		if (balance < -1 && value > branch.right.value)
			return leftRotation(branch);

		if (balance > 1 && value > branch.left.value) {
			branch.left = leftRotation(branch.left);
			return rightRotation(branch);
		}

		if (balance < -1 && value < branch.right.value) {
			branch.right = rightRotation(branch.right);
			return leftRotation(branch);
		}
		return branch;
	}

	public int getHeight (Tree branch) {
		if (branch == null)
			return -1;
		return branch.height;
		// return condition ? "isTrue" : "isFalse";
		// return (branch == null) ? -1 : branch.height;
	}

	public int getBalance (Tree branch) {
		if (branch == null)
			return 0;
		return getHeight(branch.left) - getHeight(branch.right);
		// return (branch == null) ? 0 : getHeight(branch.left) - getHeight(branch.right);
	}

	private void updateHeight (Tree branch) {
		branch.height = Math.max(getHeight(branch.left), getHeight(branch.right)) + 1;
	}

	private Tree rightRotation (Tree branch) {
		Tree newRoot = branch.left;
		Tree newParent = newRoot.right;

		newRoot.right = branch;
		branch.left = newParent;

		updateHeight(branch);
		updateHeight(newRoot);

		return newRoot;
	}

	private Tree leftRotation (Tree branch) {
		Tree newRoot = branch.right;
		Tree newParent = newRoot.left;

		newRoot.left = branch;
		branch.right = newParent;

		updateHeight(branch);
		updateHeight(newRoot);

		return newRoot;
	}

    public void preorderLeft(Tree branch) {
		if (branch != null) {
			branch.print();
			preorderLeft(branch.getLeft());
			preorderLeft(branch.getRight());
		}
	}

    public void preorderRight(Tree branch) {
		if (branch != null) {
			branch.print();
			preorderRight(branch.getRight());
			preorderRight(branch.getLeft());
		}
	}

	public void postorderLeft(Tree branch) {
		if (branch != null) {
			postorderLeft(branch.getLeft());
			postorderLeft(branch.getRight());
			branch.print();
		}
	}

	public void postorderRight(Tree branch) {
		if (branch != null) {
			postorderRight(branch.getRight());
			postorderRight(branch.getLeft());
			branch.print();
		}
	}

	public void inorderLeft(Tree branch) {
		if (branch != null) {
			inorderLeft(branch.getLeft());

			branch.print();

			inorderLeft(branch.getRight());
		}
	}

	public void inorderRight(Tree branch) {
		if (branch != null) {
			inorderRight(branch.getRight());
			branch.print();
			inorderRight(branch.getLeft());
		}
	}

	public void print() {
		System.out.print(value + " ");
	}

	public void printOneLevel(Tree branch, int level) {
		if (branch == null)
			return;

		if (level == 1) {
			System.out.print(branch.value + "\t* ");
			return;
		}

		printOneLevel(branch.left, level - 1);
		printOneLevel(branch.right, level - 1);
	}

	public void traverse(Tree branch) {
		if (branch != null) {
			int height = getHeight(branch);
			for (int i = 0; i <= height; i++) {
				System.out.print("\n* ");
				printOneLevel(branch, i + 1);
			}
		} else
			System.out.println("The tree is empty :c");
	}
}