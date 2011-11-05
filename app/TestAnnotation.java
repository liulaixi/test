import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Id;


public class TestAnnotation {

	/**
	 * 函数名称: main
	 * 函数描述: TODO(简单描述)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1 tt = new test1(1L,"liulaixi");
		Class t = tt.getClass();
		Set<Field> fields = new HashSet<Field>();
		Collections.addAll(fields, t.getDeclaredFields());
		for (Field field : fields) {
			if(field.isAnnotationPresent(Id.class)){
				System.out.println(BeanRefUtil.getFieldValueMap(tt,"name"));
				
				System.out.println(field.getType().getName());
			}
			
		}

	}

}

