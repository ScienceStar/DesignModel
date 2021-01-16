package adapter;

import inter.Bird;
import adapter.Goose;

/**
 * @program: designModel
 * @description: 鹅适配器
 * @author: liuxincheng
 * @create: 2019-04-02 13:46
 */
public class GooseAdapter implements Bird {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void chirp() {
        if(goose!=null){
            goose.chirp();
        }
    }

    @Override
    public void fly() {
        if(goose!=null){
            goose.fly();
        }
    }
}
