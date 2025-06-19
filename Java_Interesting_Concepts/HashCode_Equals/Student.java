class Student{
    int roll;
    String name;
    Student(int r, String n){
        this.roll=r;
        this.name=n;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + roll;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (roll != other.roll)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


    // @Override
    // public boolean equals(Object obj){
    //     Student other = (Student) obj;
    //     return this.roll==other.roll && this.name.equals(other.name);
    // }

    // @Override
    // public int hashCode(){
    //     return this.roll + name.hashCode();
    // }

    
}
