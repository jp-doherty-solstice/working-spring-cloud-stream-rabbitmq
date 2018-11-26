
import org.springframework.cloud.contract.spec.Contract

Contract.make {
    label("some-label")
    outputMessage {
        sentTo("foodOrders")
        body("""
        {
            "restaurant": "Mortons",
            "customerAddress": "slkdfj",
            "orderDescription": "sldfkj"
        }
        """
        )
        headers {
            header("contentType", applicationJsonUtf8())
        }
    }
}
