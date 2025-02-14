class Employe {
    int salary;
    String name;

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + salary;
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
        Employe other = (Employe) obj;
        if (salary != other.salary)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        Employe e1 = new Employe();
        Employe e2 = new Employe();
        System.out.println(e1.toString());
        System.out.println(e1.equals(e2));
    }

}
