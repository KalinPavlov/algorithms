package trie;
import java.util.HashMap;
import java.util.Map;

public class Node {
	
	private Map<Character, Node> children;
	int level;
	private boolean isWord;
	
	public Node(int level) {
		children = new HashMap<>();
		isWord = false;
		this.level = level;
	}

	public Map<Character, Node> getChildren() {
		return children;
	}

	public void setWord(boolean isWord) {
		this.isWord = isWord;
	}

	public boolean isWord() {
		return isWord;
	}

	public int getLevel() {
		return level;
	}
	
}
