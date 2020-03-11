package xiehongyuanutils;

import java.util.Date;

import com.utils.dateutil.DateUtil;

public class MyTest {

	
	public static void main(String[] args) {
		String sql = "select * from t_order where create_time>='"+DateUtil.getFirstDateForMonth(new Date())+"' and create_time<='"+DateUtil.getLastDateForMonth(new Date())+"' ";
		System.err.println(sql);
	}
}
