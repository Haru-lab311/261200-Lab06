class FlyingShark extends Shark implements Flyable{
    @Override
    public void fly(){
        System.out.println("FlyingShark is gliding through the air! (I know it's impossible but who cares!)");
    }
    public void eat(Fish fish){
        System.out.println(this.toString()+"is eating" + fish.toString());
    }
    public void eat(Flyable creature){
        System.out.println("FlyingShark caught a flying creature!");
    }
}
