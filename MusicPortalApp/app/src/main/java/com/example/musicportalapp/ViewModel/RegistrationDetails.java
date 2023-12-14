
public class Artist{

    String artistId;
    String artistName;
    String artistType;
    String artistEmailAddress;
    String artistCellNumbers

    public Artist(String artistId,String artistName,
                  String artistType,String artistEmailAddress,
                  String artistCellNumbers)
    {
        super(artistId,artistName,artistType,artistEmailAddress,artistCellNumbers);

        artistId = this.artistId;
        artistName = this.artistName;
        artistType = this.artistType;
        artistEmailAddress = this.artistEmailAddress;

    }
}