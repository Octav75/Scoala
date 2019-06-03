package javaCollections;

public class Angajati {

    public String hash;
    private Long id;
        private String name;
        private String departament;
        private Boolean areMasina;

    public Angajati() {
        this.id = null;
        this.name = null;
        this.departament = null;
        this.areMasina = false;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }

    public Boolean getAreMasina() {
        return areMasina;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public void setAreMasina(Boolean areMasina) {
        this.areMasina = areMasina;
    }

    public Angajati(Long id, String name, String departament, Boolean areMasina) {
        this.id = id;
        this.name = name;
        this.departament = departament;
        this.areMasina = areMasina;
    }

    public void initializeaza (Long id, String name, String departament, Boolean areMasina){
        this.id = id;
        this.name = name;
        this.departament = departament;
        this.areMasina = areMasina;
    }
    
    public String hash(){
        return id + " " + name + " " + departament + " " + areMasina;
    }

}


