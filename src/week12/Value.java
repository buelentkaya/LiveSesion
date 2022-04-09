package week12;

public class Value {
    int param; // you can omit initialzing to zero
    boolean calledMethod = false;
    boolean calledConstructor=false;
    public Value(){} // no parameter
    public Value(int param){ // single parameter
        this.param=param;
        calledConstructor=true;
    }
    public void setValue(int param){ // one parameter method and is void
        this.param=param;
        calledMethod =  true;
    }
    public boolean wasModified(){
        return calledMethod;
    }

    public int getValue() {
       /*
       below code becomes redundant because it is going to return instance variable in all conditions
       if(this.calledMethod){
            return this.param;
        }
        else if(calledConstructor)
            return this.param;
        else{
            return this.param;
        }
        */
        return this.param;

    }
}