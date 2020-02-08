package trie;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SpellCheckerTest {

	/*
	 * This program uses 'Trie' data structure. A tree where every node has
	 * three fields: Map<Character, Node>, isWord and level. The first one
	 * contains a map of characters and the next node. The second one specifies
	 * that the current character completes a word. The third one specifies the
	 * node level in the tree.
	 * 
	 * Inserting words as map of characters provides O(1) search time and O(n)
	 * space complexity.
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You should provide a word or list of words to check if they are valid words.");
			System.exit(-1);
		}

		SpellChecker spellChecker = new SpellChecker();
		Set<String> wordSet = new HashSet<>(Arrays.asList(spellCheckerWords()));

		for (String word : wordSet) {
			spellChecker.addWord(word);
		}

		for (int i = 0; i < args.length; i++) {
			String word = args[i];
			System.out.println("Is valid word '" + word + "'? - " + spellChecker.isValidWord(word));
		}
		
		spellChecker.printSpellCheckerTree();
	}

	private static String[] spellCheckerWords() {
		return new String[] { "cat", "car", "can", "book", "sky", "blue", "bus", "engineer", "software", "computer",
				"science", "fiction", "do", "door", "transcription", "translation", "music", "game", "theater", "there",
				"the", "then", "basket", "see", "rabbit"};
	}	
	
}
