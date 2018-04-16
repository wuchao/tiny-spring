package us.codecraft.tinyioc;

/**
 * @author yihua.huang@dianping.com
 */
public class BeanReference {

    private String name;

    // 这个字段的作用是什么
    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
