package trie;
import java.util.Map;

public class SpellChecker {
	
	private Node root;
	
	public SpellChecker() {
		super();
		root = new Node(0);
	}
	
	public void addWord(String word) {
		char[] charArray = word.toLowerCase().toCharArray();
		Map<Character, Node> childNodes = root.getChildren();
		int wordLength = charArray.length;
		int level = root.getLevel();
		
		for(int i = 0; i < wordLength; i++) {
			char character = charArray[i];
			Node existingNode = childNodes.get(character);
			if(existingNode == null) {
				Node newNode = new Node(level + 1);
				childNodes.put(character, newNode);
				childNodes = newNode.getChildren();
				level = newNode.getLevel();
				existingNode = newNode;
			} else {
				childNodes = existingNode.getChildren();
				level = existingNode.getLevel();
			}
			
			if (i == wordLength - 1) {
				existingNode.setWord(true);
			}
		}
	}
	
	public boolean isValidWord(String word) {
		char[] charArray = word.toLowerCase().toCharArray();
		int wordLength = word.length();
		Map<Character, Node> childNodes = root.getChildren();
		
		for (int i = 0; i < wordLength; i++) {
			char character = charArray[i];
			Node existingNode = childNodes.get(character);
			if (existingNode == null) {
				return false;
			} else {
				if (i == wordLength - 1) {
					return existingNode.isWord();
				}
				childNodes = existingNode.getChildren();
			}
		}
		
		return false;
	}
	
	public void printSpellCheckerTree() {
		printTreeNode(root);
	}
	
	private void printTreeNode(Node node) {
		for(Map.Entry<Character, Node> entry : node.getChildren().entrySet()) {
			System.out.println("Level: " + node.getLevel() + " Key: " + entry.getKey());
			printTreeNode(entry.getValue());
		}
	}
}
