package com.expedia.eps.product;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;
import static java.util.Objects.nonNull;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.ZonedDateTime;

/**
 * The default Jackson's ZonedDateTimeSerializer unfortunately adds the time zone in square brackets at the end of the date -
 * example: 2016-11-02T21:30:19Z[UTC]. It makes it not ISO 8601 compliant and we do not want it.
 *
 * This serializer does not add it. If the timezone is not GMT, the offset will be added under the form -hh:mm or +hh:mm.
 */
public class ZonedDateTimeSerializer extends JsonSerializer<ZonedDateTime> {

    @Override
    public void serialize(ZonedDateTime zonedDateTime, JsonGenerator generator, SerializerProvider serializers) throws
                                                                                                                IOException {
        if (nonNull(zonedDateTime)) {
            final String date = ISO_OFFSET_DATE_TIME.format(zonedDateTime);
            generator.writeString(date);
        }
    }
}
