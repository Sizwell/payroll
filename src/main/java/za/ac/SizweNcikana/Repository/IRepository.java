package za.ac.SizweNcikana.Repository;

public interface IRepository  <R, iD>
{
    R create(R r);
    R read(iD id);
    R update(R r);
    void delete(iD id);
}
