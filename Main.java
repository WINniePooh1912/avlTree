public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree(4);

		tree.push(3);
		tree.push(89);
		tree.push(5);
		tree.push(1);
		tree.push(8);
		tree.push(7);
		tree.push(12);
		tree.push(51);
		tree.push(2);
		tree.push(9);

		System.out.println("Preorder:");
		System.out.print("Left: ");
		tree.preorderLeft(tree);
		System.out.print("\nRight: ");
		tree.preorderRight(tree);

		System.out.println("\nPostorder:");
		System.out.print("Left: ");
		tree.postorderLeft(tree);
		System.out.print("\nRight: ");
		tree.postorderRight(tree);

		System.out.println("\nInorder:");
		System.out.print("Left: ");
		tree.inorderLeft(tree);
		System.out.print("\nRight: ");
		tree.inorderRight(tree);
	}
}
