package com.clement.behavioral_pattern.state;

/**
 * @Author Qinghan Huang
 * @Date 29/08/2023 15:13
 * @Desc
 * @Version 1.0
 */
public class Work {
    private State curState;
    private boolean isWorkFinished;

    public Work(State curState, boolean isWorkFinished) {
        this.curState = curState;
        this.isWorkFinished = isWorkFinished;
    }

    public void setCurState(State curState) {
        this.curState = curState;
    }

    public void setWorkFinished(boolean workFinished) {
        isWorkFinished = workFinished;
    }

    public void work(){
        curState.handle(this);
    }
}
