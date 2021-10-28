package co.simplon.api.mapper;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.convert.MongoConverter;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import co.simplon.api.models.Gymnase;

//public class PersonWriteConverter implements Converter<Gymnase, DBObject> {
//
//	  public DBObject convert(Gymnase source) {
//	    DBObject dbo = new BasicDBObject();
//	    dbo.put("_id", String.valueOf(source.getId()));
//	    dbo.put("IdGymnase", source.getIdGymnase());
//	    dbo.put("NomGymnase", source.getNomGymnase());
//	    dbo.put("Adresse", source.getAdresse());
//	    dbo.put("Ville", source.getVille());
//	    dbo.put("Surface", source.getSurface());
//	    dbo.put("Seances", source.getSeances());
//	    
//	    return dbo;
//	  }
//
//	}