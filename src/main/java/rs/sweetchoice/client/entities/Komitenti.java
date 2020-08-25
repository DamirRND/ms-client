package rs.sweetchoice.client.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Column;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "komitenti_erp_export")
public class Komitenti {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "komitenti_erp_export_seq_gen")
    @SequenceGenerator(name = "komitenti_erp_export_seq_gen", sequenceName = "komitenti_erp_export_id_seq", allocationSize = 1)
    private Long id;
    @Column(name = "sifra")
    private String sifra;
    @Column(name = "pib")
    private String pib;
    @Column(name = "sifra_djelatnosti")
    private String sifraDjelatnosti;
    @Column(name = "maticni_broj")
    private Long maticniBroj;
    @Column(name = "naziv")
    private String naziv;
    @Column(name = "pun_naziv")
    private String punNaziv;
    @Column(name = "adresa")
    private String adresa;
    @Column(name = "mjesto")
    private String mjesto;
    //strani poštanski brojevi immaju i druge karaktere osim brojeva
    @Column(name = "postanski_broj")
    private String postanskiBroj;
    @Column(name = "drzava")
    private String drzava;
    @Column(name = "grupa_komitenti")
    private Integer grupaKomitenti;
    @Column(name = "napomena")
    private String napomena;
    @Column(name = "vrsta_komitenta")
    private Integer vrstaKomitenta;
    @Column(name = "kreirao")
    private Integer kreirao;
    @Column(name = "datum_kreiranja")
    private Timestamp datumKreiranja;
    @Column(name = "izmjenio")
    private String izmjenio;
    @Column(name = "aktivno")
    private Boolean aktivno;
    @Column(name = "vrsta_privrednog_subjekta")
    private Integer vrstaPrivrednogSubjekta;
    @Column(name = "ime_vlasnika")
    private String imeVlasnika;
    @Column(name = "vrsta_pdv")
    private Long vrstaPdv;
    @Column(name = "opstina")
    private String opstina;
    @Column(name = "broj_dana_za_placanje")
    private Long brojDanaZaPlacanje;
    @Column(name = "email")
    private String email;
    @Column(name = "telefon")
    private String telefon;
    @Column(name = "centala_sifra")
    private String centralaSifra;
    @Column(name = "centrala_naziv")
    private String centralaNaziv;
    @Column(name = "povrat")
    private Boolean povrat;
    @Column(name = "podgrupe")
    private String podgrupe;
    @Column(name = "geo_lat")
    private String geoLat;
    @Column(name = "geo_long")
    private String geoLong;
    @Column(name = "region")
    private String region;
    @Column(name = "kilometraza")
    private Long kilometraza;
    @Column(name = "pripada_centru")
    private String pripadaCentru;
    @Column(name = "ko_vozi")
    private String koVozi;
    @Column(name = "lead_time")
    private Long leadTimeUDanim;
    @Column(name = "poslovodja")
    private String poslovodja;
    @Column(name = "ima_povrat")
    private Double imaPovrat;

}
