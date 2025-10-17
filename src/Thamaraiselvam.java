
//Java - Method Overload Quiz -

void main() {
    print(10);
    print(10.5);
}

static void print(int s) {
    System.out.println("Float");
}

static void print(Object s) {
    System.out.println("Object");
}
