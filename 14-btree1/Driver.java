public class Driver {
	public static void main(String[] args) {
		TreeNode<Integer> node0 = new TreeNode<>(0);
		TreeNode<String> node1 = new TreeNode<>("a");
		TreeNode<Character> node2 = new TreeNode<>('b');
		System.out.println(node0);
		System.out.println(node1);
		System.out.println(node2);
		System.out.println(node0.getLeft());
		System.out.println(node1.getRight());
		node0.setLeft(node1);
		node0.setRight(node2);
		System.out.println(node0.getLeft());
		System.out.println(node0.getRight());
	}
}
