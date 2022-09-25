
package dev.be.moduleapi.exception;

import dev.be.modulecommon.enums.response.CodeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CustomException extends RuntimeException {
    private String returnCode;
    private String returnMessage;

    public CustomException(CodeEnum codeEnum) {
        super(codeEnum.getMessage());
        setReturnCode(codeEnum.getCode());
        setReturnMessage(codeEnum.getMessage());
    }
}