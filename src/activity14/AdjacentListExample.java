/*
 * @author Xavier McNeill
 * @author Tyler Diep
 */
package activity14;

import java.util.*;

public class AdjacentListExample {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String verts, edges;
		
		System.out.println("Enter a list of vertices seperated by a comma (,):");
		verts = kbd.nextLine();
		System.out.println("Enter a list of edges seperated by a comma (,):");
		edges = kbd.nextLine();
		kbd.close();
		
		display(graphCreator(verts, edges));

	}
	
	public static LinkedList<LinkedList<String>> graphCreator(String verts, String edges) {
		LinkedList<LinkedList<String>> a = new LinkedList<LinkedList<String>>();
		StringTokenizer st1 = new StringTokenizer(verts, ",");
		
		while (st1.hasMoreTokens()) {
			LinkedList<String> b = new LinkedList<String>();
			b.add(st1.nextToken());
			
			StringTokenizer st2 = new StringTokenizer(edges, ",");
			
			while (st2.hasMoreTokens()) {
				String temp = st2.nextToken();
				if (temp.contains(b.get(0))) {
					b.add(temp.replace(b.get(0), ""));
				}
			}
			
			a.add(b);
		}
		
		return a;
	}
	
	public static void display(LinkedList<LinkedList<String>> graph) {
		for (int i = 0; i < graph.size(); i++) {
			LinkedList<String> temp = graph.get(i);
			System.out.println(temp.getFirst() + ": " + temp.subList(1, temp.size()));
		}
	}

}
