package model.entity;

import java.util.Collection;

public class UsuarioProprietario extends Usuario {

    private Collection<Hotel> hotel;

    public UsuarioProprietario() {
    }

    public UsuarioProprietario(Collection<Hotel> hotel) {
        this.hotel = hotel;
    }

    public UsuarioProprietario(String email, String senha, Collection<Hotel> hotel) {
        super(email, senha);
        this.hotel = hotel;
    }

    public UsuarioProprietario(int id, String nome, long cpf, int telefone, String email, String senha, Collection<Hotel> hotel) {
        super(id, nome, cpf, telefone, email, senha);
        this.hotel = hotel;
    }

    public UsuarioProprietario(String nome, long cpf, int telefone, String email, String senha, Collection<Hotel> hotel) {
        super(nome, cpf, telefone, email, senha);
        this.hotel = hotel;
    }

    public Collection<Hotel> getHotel() {
        return hotel;
    }

    public void setHotel(Collection<Hotel> hotel) {
        this.hotel = hotel;
    }
}