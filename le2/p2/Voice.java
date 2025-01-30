class Voice{
    void prepareVoice(){
        Animal[] animal= new Animal[5];
        animal[0]=Cow();
        animal[1]=Dog();
        animal[2]=Pig();
        animal[3]=Goat();
	animal[4]=Lion();
        hear(animal);
        
        
    }
    public void hear(Animsl animal){
        for(int i=0; i<5; i++){
            animal[i].makevoice();
        }
    }
  
}