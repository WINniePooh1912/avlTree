public class Main {
	public static void main(String[] args) {
		Tree treeImbalanced = new Tree();
		Tree treeBalanced = new Tree();

		System.out.println("\nA imbalance tree:");

		treeImbalanced.add(3);
		treeImbalanced.add(89);
		treeImbalanced.add(5);
		treeImbalanced.add(1);
		treeImbalanced.add(8);
		treeImbalanced.add(7);
		treeImbalanced.add(12);
		treeImbalanced.add(51);
		treeImbalanced.add(2);
		treeImbalanced.add(9);

		System.out.println("Preorder:");
		System.out.print("\tLeft: ");
		treeImbalanced.preorderLeft(treeImbalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeImbalanced.preorderRight(treeImbalanced.getRoot());

		System.out.println("\nPostorder:");
		System.out.print("\tLeft: ");
		treeImbalanced.postorderLeft(treeImbalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeImbalanced.postorderRight(treeImbalanced.getRoot());

		System.out.println("\nInorder:");
		System.out.print("\tLeft: ");
		treeImbalanced.inorderLeft(treeImbalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeImbalanced.inorderRight(treeImbalanced.getRoot());

		System.out.print("\nShowing imbalanced tree:");
		treeImbalanced.traverse(treeImbalanced.getRoot());

		System.out.println("\n\n\n\nA self-balance tree:");

		treeBalanced.addBalance(3);
		treeBalanced.addBalance(89);
		treeBalanced.addBalance(5);
		treeBalanced.addBalance(1);
		treeBalanced.addBalance(8);
		treeBalanced.addBalance(7);
		treeBalanced.addBalance(12);
		treeBalanced.addBalance(51);
		treeBalanced.addBalance(2);
		treeBalanced.addBalance(9);

		System.out.println("Preorder:");
		System.out.print("\tLeft: ");
		treeBalanced.preorderLeft(treeBalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeBalanced.preorderRight(treeBalanced.getRoot());

		System.out.println("\nPostorder:");
		System.out.print("\tLeft: ");
		treeBalanced.postorderLeft(treeBalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeBalanced.postorderRight(treeBalanced.getRoot());

		System.out.println("\nInorder:");
		System.out.print("\tLeft: ");
		treeBalanced.inorderLeft(treeBalanced.getRoot());
		System.out.print("\n\tRight: ");
		treeBalanced.inorderRight(treeBalanced.getRoot());

		System.out.print("\nShowing balanced tree:");
		treeBalanced.traverse(treeBalanced.getRoot());
	}
}
