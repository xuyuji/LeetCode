package xuyuji.leetcode.Q0207_CourseSchedule;

import java.util.LinkedList;
import java.util.List;

public class Solution1 {
	private List<Integer>[] graph;
	private boolean[] onStack;
	private boolean[] marked;
	private boolean hasCycle;

	@SuppressWarnings("unchecked")
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		hasCycle = false;
		graph = new List[numCourses];
		onStack = new boolean[numCourses];
		marked = new boolean[numCourses];

		for (int i = 0; i < graph.length; i++) {
			graph[i] = new LinkedList<>();
		}

		for (int[] edge : prerequisites) {
			graph[edge[0]].add(edge[1]);
		}

		for (int i = 0; i < graph.length; i++) {
			if (hasCycle) {
				break;
			}
			if (!marked[i]) {
				dfs(i);
			}
		}
		return !hasCycle;
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
	}
}
