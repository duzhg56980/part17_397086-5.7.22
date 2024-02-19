import cn.hutool.core.date.LocalDateTimeUtil;
public class FunctionUse2038 {
public void funcUse() {
LocalDateTimeUtil localdatetimeutil = new LocalDateTimeUtil();
localdatetimeutil.parseDate(null,null);
}
}