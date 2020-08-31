package symbolTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SymbolTable {

	@SuppressWarnings("rawtypes")
	private HashMap st = new HashMap();

	@SuppressWarnings("unchecked")
	public void put(String key, String value) {
		st.put(key, value);
	}

	public Object get(String key) {
		return st.get(key);
	}

	// Return an array contains all of the keys

	public String[] keys() {
		Set keyvalues = st.entrySet();
		String[] keys = new String[st.size()];
		Iterator it = keyvalues.iterator();
		for (int i = 0; i < st.size(); i++) {
			Map.Entry entry = (Map.Entry) it.next();
			keys[i] = (String) entry.getKey();
		}
		return keys;
	}

	public static String main(String[] args) {
		// SymbolTable st = new SymbolTable();

		// st.put("Blue", "000099");
		// st.put("Lime", LimeValue);
		// st.put("Orange", OrangeValue);
		// st.put("Red", RedValue);
		// st.put("White", WhiteValue);
		// st.put("Yellow", YellowValue);

		String BlueValue = Integer.toHexString(0x000099);
		String LimeValue = Integer.toHexString(0x66cc00);
		String OrangeValue = Integer.toHexString(0xff6600);
		String RedValue = Integer.toHexString(0x990000);
		String WhiteValue = Integer.toHexString(0x000000);
		String YellowValue = Integer.toHexString(0xFFFF00);

		String[] Values = new String[] { BlueValue, LimeValue, OrangeValue, RedValue, WhiteValue, YellowValue };

		String[] Colors = new String[] { "Blue", "Lime", "Orange", "Red", "White", "Yellow" };

	}

	@Override
	public String toString() {
		String results = "{";
		for (int i = 0; i < Colors.length; i++) {
			results += "'" + Colors[i] + "' : " + Values[i] + ",";
		}
		results += "}";

		return results;

	}

}
