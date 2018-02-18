

void postOrderTraversalNonRecursive(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);

		TreeNode prev = null;
		while (!s.isEmpty()) {
			TreeNode cur = s.peek();

			/*
			 * You are traversing normal path check and push else print
			 */

			if (prev == null || prev.left == cur || prev.right == cur) {
				if (cur.left != null) {
					s.push(cur.left);
				} else if (cur.right != null) {
					s.push(cur.right);
				} else {
					System.out.print(" " + s.pop().val);
				}

			/*
			 * You are done traversing normal path now you have popped a parent check if
			 * parents left traversal is done if so then perform its right traversal
			 */
			} else if (cur.left == prev) {
				if (cur.right != null) {
					s.push(cur.right);
				} else {
					System.out.print(" " + s.pop().val);
				}
			} else if (cur.right == prev) {
				System.out.print(" " + s.pop().val);
			}
			prev = cur;
		}
	}
  
  
  ****************************************
  
  	void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(" " + root.val);
	}
