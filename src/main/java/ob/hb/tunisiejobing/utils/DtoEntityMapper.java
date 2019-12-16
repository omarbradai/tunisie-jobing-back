package ob.hb.tunisiejobing.utils;

import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class DtoEntityMapper {

    private static ModelMapper modelMapper = new ModelMapper();

    public static  <EntityType, DtoType> DtoType convertToDto(EntityType entity, Class<DtoType> dtoType) {
        return modelMapper.map(entity, dtoType);
    }

    public static <DtoType, EntityType> EntityType convertToEntity(DtoType dto, Class<EntityType> entityType) {
        return modelMapper.map(dto, entityType);
    }

    public static  <EntityType, DtoType> List<DtoType> convertToDtos(List<EntityType> entities, Class<DtoType> dtoType) {
        return entities.stream()
                .map(entity -> modelMapper.map(entity, dtoType))
                .collect(Collectors.toList());
    }

    public static <DtoType, EntityType> List<EntityType> convertToEntities(List<DtoType> dtos, Class<EntityType> entityType) {
        return dtos.stream()
                .map(dto -> modelMapper.map(dto, entityType))
                .collect(Collectors.toList());
    }
}
