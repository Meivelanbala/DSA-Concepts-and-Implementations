package StackAndQueue;

public class DynamicStack extends CustomStack{
    DynamicStack(){
        super();    //call Default_size
    }
    DynamicStack(int size){
        super(size);
    }

    //Creating DynamicStack method  --> we can insert element how much we needed , there is no size limitations
    //Overriding the push method
    @Override
    public boolean push(int item){
        //Creating temp array that double in size, This will happen if stack is full and if we try to insert ele
        if(isFull()) {
            int[] temp = new int[data.length * 2];

            //Copy the elements to the doubled array
            for(int i=0;i<data.length;i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);  //if stack is not full call the push method in CustomStack class
    }

}
