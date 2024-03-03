public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();

		tree.add(3);
		tree.add(89);
		tree.add(5);
		tree.add(1);
		tree.add(8);
		tree.add(7);
		tree.add(12);
		tree.add(51);
		tree.add(2);
		tree.add(9);

		System.out.println("Preorder:");
		System.out.print("Left: ");
		tree.preorderLeft(tree.getRoot());
		System.out.print("\nRight: ");
		tree.preorderRight(tree.getRoot());

		System.out.println("\nPostorder:");
		System.out.print("Left: ");
		tree.postorderLeft(tree.getRoot());
		System.out.print("\nRight: ");
		tree.postorderRight(tree.getRoot());

		System.out.println("\nInorder:");
		System.out.print("Left: ");
		tree.inorderLeft(tree.getRoot());
		System.out.print("\nRight: ");
		tree.inorderRight(tree.getRoot());
	}
}
