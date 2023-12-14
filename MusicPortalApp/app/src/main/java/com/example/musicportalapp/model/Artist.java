
public class Artist{

    String artistId;
    String artistName;
    String artistType;
    String artistEmailAddress;
    String artistCellNumbers

    public Artist(String artistId,String artistName, String artistSurname
                  String artistType,String artistEmailAddress,
                  String artistCellNumbers,String artistResidentialAddress,
                  String artistPostalAddress)
    {
        super(artistId,artistName,artistType,artistEmailAddress,artistCellNumbers);

        artistId = this.artistId;
        artistName = this.artistName;
        artistSurname = this.artistSurname;
        artistType = this.artistType;
        artistCellNumbers = this.artistCellNumbers;
        artistEmailAddress = this.artistEmailAddress;
        artistResidentialAddress = this.artistResidentialAddress;
    }

    public String getArtistId()
    {
        return this.artistId;
    }

    public String getArtistName()
    {
        return this.artistName;
    }

    public String getArtistSurname()
    {
        return this.artistSurname;
    }

    public String getArtistType()
    {
        return this.artistType;
    }

    public String getArtistCellNumbers()
    {
        return this.artistCellNumbers;
    }

    public String getArtistEmailAddress()
    {
        return this.artistEmailAddress;
    }

    public String getArtistCellNumbers()
    {
        return this.artistResidentialAddress;
    }

}