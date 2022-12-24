package dev.rabbit.generated;

import java.math.BigInteger;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.9.4.
 */
@SuppressWarnings("rawtypes")
public class BitMathEchidnaTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506102b2806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c80632d711e0c1461003b578063f94ac90e1461005a575b600080fd5b6100586004803603602081101561005157600080fd5b5035610077565b005b6100586004803603602081101561007057600080fd5b50356100ab565b6000610082826100e8565b905060ff811660020a821661009357fe5b60001960ff821660020a018216156100a757fe5b5050565b60006100b6826101dc565b90508060ff1660020a8210156100c857fe5b8060ff1660ff14806100e257508060010160ff1660020a82105b6100a757fe5b60008082116100f657600080fd5b5060ff6fffffffffffffffffffffffffffffffff82161561011a57607f1901610122565b608082901c91505b67ffffffffffffffff82161561013b57603f1901610143565b604082901c91505b63ffffffff82161561015857601f1901610160565b602082901c91505b61ffff82161561017357600f190161017b565b601082901c91505b60ff82161561018d5760071901610195565b600882901c91505b600f8216156101a757600319016101af565b600482901c91505b60038216156101c157600119016101c9565b600282901c91505b60018216156101d757600019015b919050565b60008082116101ea57600080fd5b600160801b82106101fd57608091821c91015b68010000000000000000821061021557604091821c91015b640100000000821061022957602091821c91015b62010000821061023b57601091821c91015b610100821061024c57600891821c91015b6010821061025c57600491821c91015b6004821061026c57600291821c91015b600282106101d75760010191905056fea2646970667358221220e761bedc85513baaebc9ebaf9305400676f740fc99f76260586a73a917b6c50264736f6c63430007060033";

    public static final String FUNC_LEASTSIGNIFICANTBITINVARIANT = "leastSignificantBitInvariant";

    public static final String FUNC_MOSTSIGNIFICANTBITINVARIANT = "mostSignificantBitInvariant";

    @Deprecated
    protected BitMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BitMathEchidnaTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected BitMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected BitMathEchidnaTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    @Deprecated
    public static BitMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BitMathEchidnaTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static BitMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BitMathEchidnaTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static BitMathEchidnaTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new BitMathEchidnaTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BitMathEchidnaTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new BitMathEchidnaTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BitMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BitMathEchidnaTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BitMathEchidnaTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BitMathEchidnaTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<BitMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BitMathEchidnaTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BitMathEchidnaTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BitMathEchidnaTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
