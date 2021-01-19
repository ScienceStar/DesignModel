package adapter;

import inter.Bird;

import java.util.Objects;

/**
 * @ClassName ParrotAdapter
 * @Description: TODO 鹦鹉适配器
 * @Author lxc
 * @Date 2021/1/16 11:17
 * @Version V1.0
 **/
public class ParrotAdapter implements Bird {

    private Parrot parrot;

    public ParrotAdapter(Parrot parrot) {
        this.parrot = parrot;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParrotAdapter)) {
            return false;
        }
        ParrotAdapter that = (ParrotAdapter) o;
        return Objects.equals(parrot, that.parrot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parrot);
    }

    @Override
    public void chirp() {
        if(parrot!=null){
            parrot.chirp();
        }
    }

    @Override
    public void fly() {
        if(parrot!=null){
            parrot.fly();
        }
    }
}
