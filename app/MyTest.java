import java.util.Properties;

import com.hxrainbow.common.util.PropertyUtil;


public class MyTest {

	/**
	 * 函数名称: main
	 * 函数描述: TODO(简单描述)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Properties test = PropertyUtil.loadFromResource(MyTest.class, "/test.properties");
		Object o = test.get("hxbos.platform.login");
		System.out.println(o.toString());
	}

}

