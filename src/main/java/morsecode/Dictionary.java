package morsecode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Dictionary {

	Map<String, String> morsecode = new HashMap<String, String>();

	public void fillEntries(String key, String value) {

		morsecode.put(key, value);
	}

	public boolean containsKey(String code) {

		return morsecode.containsKey(code);
	}

	public String getValue(String string) {

		return morsecode.get(string);
	}

	public void getEntries() {

		Set set = morsecode.entrySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {

			Map.Entry<String, String> mentry = (Map.Entry) itr.next();

			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

	}

}
