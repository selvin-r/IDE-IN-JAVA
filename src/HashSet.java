 class hashSet {
    static void main() {

        myhashSet set = new myhashSet(10);

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.display();

        System.out.println(set.Contains(100));

        set.Remove(20);
        set.display();


    }

    static class myhashSet{

        private int arr [];
        private int size;

        public myhashSet(int capacity){

            arr =new int [capacity];
            for(int i=0;i<capacity;i++){
                arr[i]=-1;
            }
            size=capacity;
        }


        // Hash Function


        private int hash(int key){
            return key % size;
        }

        // ADD Function

        public void add(int key){
            int index =hash(key);

            while (arr[index] !=-1){
                if(arr[index]==key){
                    return;
                }
                index =(index +1) % size;
            }
            arr[index] =key;
        }

        // Contains Function

        public boolean Contains(int key){

            int index = hash(key);

            while (arr[index] !=-1){


                if(arr[index] ==key){

                    return true;
                }
                index =((index +1) %size);
            }
            return false;
        }


        // Remove Function

        public void Remove(int key){

            int index =hash(key);

            while (arr[index] !=-1){

                if(arr[index]==key){
                    arr[index] =-1;
                    return;
                }
                index =(index +1) % size;
            }
        }


        public void display(){

            for(int value : arr){
                if(value !=-1){
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
