import java.util.Random;

public class GameBoard
{
	private TreeNode root;	// the root of the tree
	private Random rand;
	
	
	/**	Creates a full binary tree rooted at  root  with  numLevels  levels
	 * 	with a random integer from 0 to 9, inclusive, generated for each node
	 * 	@param numLevels  the number of levels in the tree
	 *			Precondition: numLevels > 0
	 */
	public GameBoard(int numLevels) {
		rand = new Random();
		root = new TreeNode(rand.nextInt(10));
		GameBoardHelper(root, numLevels-1);
	}
	
	private void GameBoardHelper(TreeNode node, int numLevels) {
		if(numLevels <= 0)
			return;
		
		TreeNode left = new TreeNode(rand.nextInt(10));
		TreeNode right = new TreeNode(rand.nextInt(10));
		node.setLeft(left);
		node.setRight(right);
		GameBoardHelper(left, numLevels-1);
		GameBoardHelper(right, numLevels-1);
	}
	
	
	/** @return  the maximum path score for this  GameBoard
	 */
	public int getMaxScore() {
		return getMaxHelper(root);
	}
	
	
	
	/** @param current  the root of the subtree to be processed
	 * 	@return  the maximum path score for the subtree rooted at  current
	 */
	private int getMaxHelper(TreeNode current) {
		if(current == null)
			return 0;

		int a = getMaxHelper(current.getLeft());
		int b = getMaxHelper(current.getRight());
		return current.getData() + Math.max(a,b);
	}
	
	
	
	// There may be fields, constructors, and methods that are not shown.
}
