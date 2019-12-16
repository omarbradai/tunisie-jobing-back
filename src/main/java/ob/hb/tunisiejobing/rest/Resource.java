package ob.hb.tunisiejobing.rest;

import ob.hb.tunisiejobing.utils.DtoEntityMapper;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface Resource <EntityType, DtoType> {

    default ResponseEntity<DtoType> response(EntityType entity, Class<DtoType> dtoType) {
        return Optional.ofNullable(entity)
                .map(e -> ResponseEntity.ok(DtoEntityMapper.convertToDto(e, dtoType)))
                .orElse(ResponseEntity.notFound().build());
    }

    default ResponseEntity<List<DtoType>> response(List<EntityType> entities, Class<DtoType> dtoType) {
        return Optional.ofNullable(entities)
                .map(e -> ResponseEntity.ok(DtoEntityMapper.convertToDtos(e, dtoType)))
                .orElse(ResponseEntity.noContent().build());
    }
}
