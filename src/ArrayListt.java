public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo

public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo


public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo







public class ArrayListt {
    public static void main(String[] args) {

    }
}

class myArrayList {
    private Object[] arr;
    private int size;

    public myArrayList(int capacity) {
        arr = new Object[capacity];
        size = 0;
    }

    public void add(Object value) {
        if (size == arr.length) {
            System.out.println("List is full!");
            return;
        }
        arr[size++] = value;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        return arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null; // clear the last element
    }

    public int size() {
        return size;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Example Usage
class ArraysList {
    public static void main(String[] args) {
        myArrayList list = new myArrayList(5);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("Selvin");
        list.display();

        list.remove(3);
        list.display();

        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("List size: " + list.size());
    }
}
//==============================================================================\\



// Demo


















