package com.xiaoming.pattern.state;

public class Context {
    private State state;
    // 定义Context的初始状态
    public Context(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    // 对请求做处理，并设置下一状态
    public void request(){
        state.handle(this);
    }
}
