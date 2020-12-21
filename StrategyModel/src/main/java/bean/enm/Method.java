package bean.enm;

/**
 * @ClassName Method
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 10:47
 * @Version V1.0
 **/
public enum Method {
    Get("get"),
    Post("post");

    private String value;

    Method(String value){
        this.value=value;
    }

    public String getValue(){
        return value;
    }
}
