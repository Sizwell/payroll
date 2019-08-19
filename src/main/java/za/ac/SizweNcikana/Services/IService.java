package za.ac.SizweNcikana.Services;

public interface IService <I, ID>
{
    I create(I type);
    I read(ID id);
    I update(I type);
    void delete(ID id);
}
