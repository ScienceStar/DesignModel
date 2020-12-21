package bean.enm;

import bean.Common;

/**
 * @ClassName AnimalEnum
 * @Description: TODO
 * @Author lxc
 * @Date 2020/12/21 12:00
 * @Version V1.0
 **/
public enum AnimalEnum implements Common {
    PANDA{
        @Override
        public String eat() {
            return "吃竹子";
        }
    };
}
