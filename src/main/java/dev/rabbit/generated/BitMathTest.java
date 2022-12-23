package dev.rabbit.generated;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
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
public class BitMathTest extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506102f7806100206000396000f3fe608060405234801561001057600080fd5b506004361061004b5760003560e01c806246b777146100505780636b83cf261461007f578063d230d23f1461009c578063e6bcbc65146100cf575b600080fd5b61006d6004803603602081101561006657600080fd5b50356100ec565b60408051918252519081900360200190f35b61006d6004803603602081101561009557600080fd5b5035610107565b6100b9600480360360208110156100b257600080fd5b5035610116565b6040805160ff9092168252519081900360200190f35b6100b9600480360360208110156100e557600080fd5b5035610127565b6000805a90506100fb8361012e565b505a900390505b919050565b6000805a90506100fb836101ce565b6000610121826101ce565b92915050565b6000610121825b600080821161013c57600080fd5b600160801b821061014f57608091821c91015b68010000000000000000821061016757604091821c91015b640100000000821061017b57602091821c91015b62010000821061018d57601091821c91015b610100821061019e57600891821c91015b601082106101ae57600491821c91015b600482106101be57600291821c91015b6002821061010257600101919050565b60008082116101dc57600080fd5b5060ff6fffffffffffffffffffffffffffffffff82161561020057607f1901610208565b608082901c91505b67ffffffffffffffff82161561022157603f1901610229565b604082901c91505b63ffffffff82161561023e57601f1901610246565b602082901c91505b61ffff82161561025957600f1901610261565b601082901c91505b60ff821615610273576007190161027b565b600882901c91505b600f82161561028d5760031901610295565b600482901c91505b60038216156102a757600119016102af565b600282901c91505b6001821615610102576000190191905056fea26469706673582212206eecb36617e79f254ff8827a1bed706e680a72d4a54b0f3cafe4fc81ab5bb5d464736f6c63430007060033";

    public static final String FUNC_GETGASCOSTOFLEASTSIGNIFICANTBIT = "getGasCostOfLeastSignificantBit";

    public static final String FUNC_GETGASCOSTOFMOSTSIGNIFICANTBIT = "getGasCostOfMostSignificantBit";

    public static final String FUNC_LEASTSIGNIFICANTBIT = "leastSignificantBit";

    public static final String FUNC_MOSTSIGNIFICANTBIT = "mostSignificantBit";

    @Deprecated
    protected BitMathTest(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected BitMathTest(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected BitMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected BitMathTest(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfLeastSignificantBit(BigInteger x) {
        final Function function = new Function(FUNC_GETGASCOSTOFLEASTSIGNIFICANTBIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getGasCostOfMostSignificantBit(BigInteger x) {
        final Function function = new Function(FUNC_GETGASCOSTOFMOSTSIGNIFICANTBIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> leastSignificantBit(BigInteger x) {
        final Function function = new Function(FUNC_LEASTSIGNIFICANTBIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> mostSignificantBit(BigInteger x) {
        final Function function = new Function(FUNC_MOSTSIGNIFICANTBIT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(x)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint8>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static BitMathTest load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new BitMathTest(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static BitMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new BitMathTest(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static BitMathTest load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new BitMathTest(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static BitMathTest load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new BitMathTest(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<BitMathTest> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BitMathTest.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BitMathTest> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BitMathTest.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<BitMathTest> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(BitMathTest.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<BitMathTest> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(BitMathTest.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
