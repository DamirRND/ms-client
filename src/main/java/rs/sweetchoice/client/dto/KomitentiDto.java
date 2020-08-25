package rs.sweetchoice.client.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class KomitentiDto {
    private String sifra;
    private String pib;
    private String sifraDjelatnosti;
    private Long maticniBroj;
    private String naziv;
    private String punNaziv;
    private String adresa;
    private String mjesto;
    private String postanskiBroj;
    private String drzava;
    private Integer grupaKomitenti;
    private String napomena;
    private Integer vrstaKomitenta;
    private Integer kreirao;
    private Timestamp datumKreiranja;
    private String izmenio;
    private Boolean aktivno;
    private Integer vrstaPrivrednogSubjekta;
    private String imeVlasnika;
    private Long vrstaPdv;
    private String opstina;
    private Long brojDanaZaPlacanje;
    private String email;
    private String telefon;
    private String centralaSifra;
    private String centralaNaziv;
    private Boolean povrat;
    private String podgrupe;
    private String geoLat;
    private String geoLong;
    private String region;
    private Long kilometraza;
    private String pripadaCentru;
    private String koVozi;
    private Long leadTimeUDanim;
    private String poslovodja;
    private Double imaPovrat;
}
