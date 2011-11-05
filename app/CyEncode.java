public class CyEncode {
	private String zhStr; // 中文字符串
	private String unicode;// 将中文字符串转换为Unicode编码 存储在这个属性上。

	public CyEncode(String zhStr) {
		this.zhStr = zhStr;
	}

	public String getZhStr() {
		return zhStr;
	}

	public void setZhStr(String zhStr) {
		this.zhStr = zhStr;
	}

	public String toUnicode() {
		StringBuffer unicode = new StringBuffer();
		for (int i = 0; i < zhStr.length(); i++) {
			char c = zhStr.charAt(i);
			unicode.append("\\u" + Integer.toHexString(c));
		}
		this.unicode = unicode.toString();
		return unicode.toString();
	}

	public String tozhCN() {
		StringBuffer gbk = new StringBuffer();
		String[] hex = unicode.split("\\\\u"); // 妈的，分割让我想了半天！！不是"\\u"，而是
												// "\\\\u"
		for (int i = 1; i < hex.length; i++) { // 注意要从 1 开始，而不是从0开始。第一个是空。
			int data = Integer.parseInt(hex[i], 16); // 将16进制数转换为 10进制的数据。
			gbk.append((char) data); // 强制转换为char类型就是我们的中文字符了。
		}
		System.out.println("这是从 Unicode编码 转换为 中文字符了: " + gbk.toString());
		return gbk.toString();
	}

	public static void main(String args[]) {

		CyEncode fc = new CyEncode("为布局发的说法");
		System.out.println(fc.toUnicode());
		fc.tozhCN();
	}
}