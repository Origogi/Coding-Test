package hackerrank.nexon;

import java.util.LinkedList;
import java.util.List;

class StringsCollection {
    List<String> collection = new LinkedList<>();

    List<String> getStringsCollection() {
        return collection;
    }

    synchronized void addString(String str) {
        collection.add(str);
    }

}

public class Test4 {
}
