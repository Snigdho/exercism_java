// https://exercism.org/tracks/java/exercises/gotta-snatch-em-all/

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<String>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(
        Set<String> myCollection,
        Set<String> theirCollection
    ) {
        boolean iHaveUnique = false;
        boolean theyHaveUnique = false;

        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                iHaveUnique = true;
                break;
            }
        }

        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                theyHaveUnique = true;
                break;
            }
        }

        return iHaveUnique && theyHaveUnique;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        if (collections.isEmpty()) return new HashSet<String>();

        Set<String> result = new HashSet<>(collections.get(0));
        for (Set<String> set : collections) {
            result.retainAll(set);
        }

        return result;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> result = new HashSet<String>();
        for (Set<String> set : collections) {
            result.addAll(set);
        }

        return result;
    }
}
