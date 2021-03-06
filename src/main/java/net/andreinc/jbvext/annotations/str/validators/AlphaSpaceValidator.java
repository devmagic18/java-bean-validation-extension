package net.andreinc.jbvext.annotations.str.validators;

import net.andreinc.jbvext.annotations.str.AlphaSpace;
import org.apache.commons.lang3.StringUtils;

import java.util.function.Function;

public class AlphaSpaceValidator extends GenericStringValidator<AlphaSpace> {
    @Override
    public Function<String, Boolean> condition() {
        return StringUtils::isAlphaSpace;
    }
}
