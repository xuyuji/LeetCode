package xuyuji.leetcode.Q0210_CourseScheduleII;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution1 {

	private List<Integer>[] graph;
	private boolean[] marked;
	private boolean[] onStack;
	private boolean hasCycle;
	private Stack<Integer> reversePost;

	public int[] findOrder(int numCourses, int[][] prerequisites) {
		graph = new List[numCourses];
		for (int i = 0; i < numCourses; i++) {
			graph[i] = new LinkedList();
		}
		marked = new boolean[numCourses];
		onStack = new boolean[numCourses];
		reversePost = new Stack();

		for (int i = 0; i < prerequisites.length; i++) {
			graph[prerequisites[i][0]].add(prerequisites[i][1]);
		}

		for (int i = 0; i < numCourses; i++) {
			if (hasCycle) {
				return new int[0];
			}
			if (!marked[i]) {
				dfs(i);
			}
		}

		int[] order = new int[numCourses];
		for (int i = 0; i < numCourses; i++) {
			order[i] = reversePost.get(i);
		}
		return order;
	}

	private void dfs(int i) {
		marked[i] = true;
		onStack[i] = true;
		for (int adj : graph[i]) {
			if (onStack[adj]) {
				hasCycle = true;
				return;
			}
			if (!marked[adj]) {
				dfs(adj);
			}
		}
		onStack[i] = false;
		reversePost.push(i);
	}
}
