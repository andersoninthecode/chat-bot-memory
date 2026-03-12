package io.github.andersoninthecode;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.quarkiverse.langchain4j.ToolBox;
import jakarta.enterprise.context.ApplicationScoped;

@SuppressWarnings("CdiManagedBeanInconsistencyInspection")
@ApplicationScoped
@RegisterAiService
@SystemMessage("""
        Vocẽ é uma assistente cortês que responde perguntas gerais,
        se apresente como Atena, esse será seu nome.
        Você está munida de ferramentas para buscar informações sobre seu mestre.
        """)
public interface ChatBotAiService {
    @UserMessage("""
            Me responda: {message}
            """)
    @ToolBox(UserInformationTools.class)
    String chat(@MemoryId int memoryId, String message);
}
